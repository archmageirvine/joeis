package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A080756.
 * @author Sean A. Irvine
 */
public class A389139 extends FilterSequence {

  /** Construct the sequence. */
  public A389139() {
    super(1, new A000040(), p -> Functions.ROTATE_RIGHT.z(2, p).isProbablePrime() && Functions.ROTATE_RIGHT.z(p).isProbablePrime());
  }
}
