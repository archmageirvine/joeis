package irvine.oeis.a359;
// manually robots/dirichinv at 2023-09-09 10:06

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a349.A349905;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A359791 Dirichlet inverse of function f(n) = 1 + A349905(n), where A349905(n) is the arithmetic derivative of prime shifted n.
 * @author Georg Fischer
 */
public class A359791 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new SimpleTransformSequence(1, new A349905(), v -> v.add(1)));

  /** Construct the sequence. */
  public A359791() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
