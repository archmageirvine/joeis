package irvine.oeis.a093;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a073.A073846;

/**
 * A093458 Mixed factorials. Define MF(n) as the product prime(1)*composite(1)*(prime(2)*composite(2)...prime(n/2)*composite(n/2) if n is even else MF(n) as the product prime(1)*composite(1)*(prime(2)*composite(2)*...*prime((n+1)/2). a(0)= 1.
 * @author Georg Fischer
 */
public class A093458 extends PartialProductSequence {

  /** Construct the sequence. */
  public A093458() {
    super(0, new A073846());
  }
}
