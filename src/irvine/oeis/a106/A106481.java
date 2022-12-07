package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a049.A049690;
import irvine.oeis.a099.A099957;

/**
 * A106481 An Euler phi transform of 1/(1-x^2).
 * @author Georg Fischer
 */
public class A106481 extends Sequence0 {

  private int mN = -1;
  private final A049690 mA049690 = new A049690();
  private final A099957 mA099957 = new A099957();

  /** Construct the sequence. */
  public A106481() {
  }

  @Override
  public Z next() {
    // a(2n)=A049690(n). a(2n+1)=A099957(n).
    ++mN;
    return ((mN & 1) == 0) ? mA049690.next() : mA099957.next();
  }
}
