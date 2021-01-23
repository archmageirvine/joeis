package irvine.oeis.a003;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a001.A001274;

/**
 * A003276 Numbers n such that the multiplicative group of residues prime to n, M_n, is isomorphic to M_{n+1}.
 * @author Sean A. Irvine
 */
public class A003276 extends A001274 {

  // This sequence is a subset of A001274 which gives phi(n) == phi(n+1)

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.equals(Z.ONE)) {
        return n;
      }
      final IntegersModMul g = new IntegersModMul(n);
      final IntegersModMul h = new IntegersModMul(n.add(1));
      if (g.isIsomorphic(h)) {
        return n;
      }
    }
  }

}
