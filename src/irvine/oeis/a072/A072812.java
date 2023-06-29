package irvine.oeis.a072;
// manually (bindec) at 2021-08-04

import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010051;
import irvine.oeis.cons.BinaryToDecimalExpansionSequence;

/**
 * A072812 Take the binary number P = 1.01101010001... which has an 1 in each decimal position that is a prime (e.g. 2,3,5,7...) and convert this number to base 10.
 * @author Georg Fischer
 */
public class A072812 extends PrependSequence {

  /** Construct the sequence. */
  public A072812() {
    super(1, new BinaryToDecimalExpansionSequence(new A010051()), 1);
  }
}
