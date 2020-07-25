package irvine.math.group;

import irvine.math.polynomial.CycleIndex;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000653;
import irvine.oeis.a000.A000654;

/**
 * Generate cycle index tables for documents.
 * @author Sean A. Irvine
 */
public final class GenerateCycleIndexTables {

  private GenerateCycleIndexTables() {
  }

  /**
   * Generate cycle index tables.
   * @param args ignored
   */
  public static void main(final String[] args) {
    if ("sym".equals(args[0])) {
      Z f = Z.ONE;
      for (int k = 1; k <= 12; ++k) {
        f = f.multiply(k);
        final CycleIndex ci = SymmetricGroup.create(k).cycleIndex();
        ci.multiply(new Q(f));
        final String s = ci.toString().replace('x', 'z');
        System.out.println(k + "&" + s.substring(s.indexOf('=') + 2) + "\\\\");
      }
    } else if ("alt".equals(args[0])) {
        Z f = Z.ONE;
        for (int k = 1; k <= 10; ++k) {
          f = f.multiply(k);
          final CycleIndex ci = AlternatingGroup.create(k).cycleIndex();
          ci.multiply(new Q(f, Z.TWO));
          final String s = ci.toString().replace('x', 'z');
          System.out.println(k + "&" + s.substring(s.indexOf('=') + 2) + "\\\\");
        }
    } else if ("dihedral".equals(args[0])) {
      for (int k = 1; k <= 20; ++k) {
        final CycleIndex ci = DihedralGroup.cycleIndex(k);
        ci.multiply(new Q(2 * k));
        final String s = ci.toString().replace('x', 'z');
        System.out.println(k + "&" + s.substring(s.indexOf('=') + 2) + "\\\\");
      }
    } else if ("booleang".equals(args[0])) {
      new A000654() {
        {
          Z f = Z.ONE;
          for (int k = 1; k <= 10; ++k) {
            final CycleIndex ci = f(k);
            f = f.multiply(k);
            ci.multiply(new Q(f.multiply(1L << k)));
            final String s = ci.toString().replace('x', 'z');
            System.out.println(k + "&" + s.substring(s.indexOf('=') + 2) + "\\\\");
          }
        }
      };
    } else if ("booleans".equals(args[0])) {
      new A000653() {
        {
          Z f = Z.ONE;
          for (int k = 1; k <= 10; ++k) {
            final CycleIndex ci = f(k);
            f = f.multiply(k);
            ci.multiply(new Q(f));
            final String s = ci.toString().replace('x', 'z');
            System.out.println(k + "&" + s.substring(s.indexOf('=') + 2) + "\\\\");
          }
        }
      };
    } else {
      for (int k = 1; k <= 20; ++k) {
        final CycleIndex ci = new CyclicGroup(k).cycleIndex();
        ci.multiply(new Q(k));
        final String s = ci.toString().replace('x', 'z');
        System.out.println(k + "&" + s.substring(s.indexOf('=') + 2) + "\\\\");
      }
    }
  }
}

