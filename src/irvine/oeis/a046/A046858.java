package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046858 Irregular triangle read by rows: <code>T(n,k) =</code> number of directed graphs-with-loops with n nodes and k arcs <code>(n &gt;= 0, 0 &lt;= k &lt;= n^2</code>.
 * @author Sean A. Irvine
 */
public class A046858 implements Sequence {

  // Following matches Harary, "Linear, Directed, Rooted, and Connected Graphs", see pp. 452-453
//  private static CycleIndex orderedPairSymmetricCycleIndex(final int p) {
//    final CycleIndex ci = new CycleIndex("Z2(S_" + p + ")");
//    final IntegerPartition ip = new IntegerPartition(p);
//    final int[] a = new int[p + 1];
//    int[] part;
//    while ((part = ip.next()) != null) {
//      IntegerPartition.toCountForm(part, a);
//      final MultivariateMonomial mm = new MultivariateMonomial();
//      for (int k = 1; k < a.length; ++k) {
//        if (a[k] > 0) {
//          mm.add(k, 2 * k * a[k] * (a[k] - 1) / 2);
//          if (k > 1) {
//            mm.add(k, (k - 1) * a[k]);
//          }
//        }
//      }
//      for (int q = 1; q < a.length; ++q) {
//        if (a[q] > 0) {
//          for (int r = q + 1; r < a.length; ++r) {
//            if (a[r] > 0) {
//              mm.add(IntegerUtils.lcm(q, r), 2 * a[q] * a[r] * IntegerUtils.gcd(q, r));
//            }
//          }
//        }
//      }
//      mm.setCoefficient(new Q(Z.ONE, SymmetricGroup.per(a)));
//      ci.add(mm);
//    }
//    return ci;
//  }
//
//  // original in German, hard to understand
//
//  //private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
//  private int mN = 0;

  @Override
  public Z next() {
//    ++mN;
//    System.out.println(orderedPairSymmetricCycleIndex(mN));
//    System.out.println(orderedPairSymmetricCycleIndex(mN).applyOnePlusXToTheN());
   // final CycleIndex ci = SymmetricGroup.create(mN).cycleIndex();
//    System.out.println(ci.apply(RING.series(RING.x(), RING.onePlusXToTheN(1), 2 * mN), 2 * mN));
   // final CycleIndex ci2 = ci.op(PairMultiply.OP, Z2);
//    final CycleIndex ci2 = ci.wreath(Z2);
    //final CycleIndex ci2 = ci.op(HararyMultiply.OP, DihedralGroup.cycleIndex(mN));
   // System.out.println(ci2);
   // System.out.println(znp.applyOnePlusXToTheN());
    // return Z.ZERO;
    throw new UnsupportedOperationException();
  }
}
