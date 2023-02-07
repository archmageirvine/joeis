package irvine.oeis.a198;
// manually etman at 2023-02-06 12:43

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001678;

/**
 * A198518 G.f. satisfies: A(x) = exp( Sum_{n&gt;=1} A(x^n)/(1+x^n) * x^n/n  ).
 * <code>a(n) = A001678(n + 1) + A001678(n + 2).</code>
 * @author Georg Fischer
 */
public class A198518 extends Sequence0 {

  private final A001678 mSeq = new A001678();
  private Z mS0;

  /** Construct the sequence. */
  public A198518() {
    mSeq.next();
    mS0 = mSeq.next();
  }

  @Override
  public Z next() {
    final Z s1 = mSeq.next();
    final Z result = mS0.add(s1);
    mS0 = s1;
    return result;
  }
}
