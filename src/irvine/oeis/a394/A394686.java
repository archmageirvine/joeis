package irvine.oeis.a394;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A394686 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A394686 extends FilterSequence {

  /** Construct the sequence. */
  public A394686() {
    super(1, new A000040(), prime -> {
      final Permutation perm = Permutation.permuter(prime);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0 && prime.add(Permutation.permToZ(p)).isProbablePrime()) {
          return true;
        }
      }
      return false;
    });
  }
}
