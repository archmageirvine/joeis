package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000351;
import irvine.oeis.a003.A003593;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079002 Numbers n such that the Fibonacci residues F(k) mod n form the complete set (0,1,2,...,n-1).
 * @author Sean A. Irvine
 */
public class A079002 extends UnionSequence {

  private static final Z Z14 = Z.valueOf(14);

  /** Construct the sequence. */
  public A079002() {
    super(1, new A003593(),
      new A000351(),
      new SimpleTransformSequence(new A000351(), Z::multiply2),
      new SimpleTransformSequence(new A000351(), Z.FOUR::multiply),
      new SimpleTransformSequence(new A000351(), Z.SIX::multiply),
      new SimpleTransformSequence(new A000351(), Z.SEVEN::multiply),
      new SimpleTransformSequence(new A000351(), Z14::multiply)
    );
  }
}
