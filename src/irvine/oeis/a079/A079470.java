package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A079466 Numbers k such that the "inventory" A063850 of k is a palindrome.
 * @author Sean A. Irvine
 */
public class A079470 extends FilterSequence {

  /** Construct the sequence. */
  public A079470() {
    super(1, new A000040(), p -> Functions.INVENTORY.z(p).isProbablePrime());
  }
}
