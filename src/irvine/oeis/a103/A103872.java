package irvine.oeis.a103;
// manually deris/essent at 2022-04-27 19:28

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005043;

/**
 * A103872 a(n) = 3*trinomial(n+1,0) - trinomial(n+2,0).
 * @author Georg Fischer
 */
public class A103872 extends SkipSequence {

  /** Construct the sequence. */
  public A103872() {
    super(new A005043(), 1);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
