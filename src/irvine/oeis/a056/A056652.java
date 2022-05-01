package irvine.oeis.a056;

import irvine.oeis.MultiplicativeClosureSequence;
import irvine.oeis.a000.A000668;

/**
 * A056636.
 * @author Sean A. Irvine
 */
public class A056652 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A056652() {
    super(new A000668());
    next(); // skip 1
  }
}
