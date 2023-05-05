package irvine.oeis.a235;
// manually partprod at 2023-05-04 20:46

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a049.A049606;

/**
 * A235062 Odd part of n-th superfactorial (A000178).
 * @author Georg Fischer
 */
public class A235062 extends PartialProductSequence {

  /** Construct the sequence. */
  public A235062() {
    super(new A049606());
    next();
  }
}
