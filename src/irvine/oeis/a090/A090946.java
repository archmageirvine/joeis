package irvine.oeis.a090;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000204;

/**
 * A090946 Non-Lucas numbers: complement of A000204.
 * @author Sean A. Irvine
 */
public class A090946 extends ComplementSequence {

  /** Construct the sequence. */
  public A090946() {
    super(new A000204());
  }
}
