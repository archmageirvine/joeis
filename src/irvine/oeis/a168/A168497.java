package irvine.oeis.a168;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a040.A040040;

/**
 * A168497 The halfs of even single (or even isolated) numbers.
 * @author Georg Fischer
 */
public class A168497 extends PrependSequence {

  /** Construct the sequence. */
  public A168497() {
    super(1, new A040040(), 1);
  }
}
