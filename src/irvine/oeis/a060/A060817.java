package irvine.oeis.a060;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000142;

/**
 * A060817 Size of the automorphism group of the alternating group A_n.
 * @author Sean A. Irvine
 */
public class A060817 extends PrependSequence {

  /** Construct the sequence. */
  public A060817() {
    super(1, new A000142().skip(7), 1, 1, 2, 24, 120, 1440);
  }
}
