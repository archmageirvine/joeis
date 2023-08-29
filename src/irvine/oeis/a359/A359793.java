package irvine.oeis.a359;
// manually  at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a003.A003415;

/**
 * A359793 Dirichlet inverse of (-1)^A003415(n), where A003415 is the arithmetic derivative of n.
 * @author Georg Fischer
 */
public class A359793 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A359793() {
    super(1, new A003415() {
      {
        skip(1);
      }

      @Override
      public Z next() {
        return Z.NEG_ONE.pow(super.next());
      }
    });
  }
}
