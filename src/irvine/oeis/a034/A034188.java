package irvine.oeis.a034;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A034188 Number of binary codes of length 3 with n words.
 * @author Sean A. Irvine
 */
public class A034188 extends PrependSequence {

  /** Construct the sequence. */
  public A034188() {
    super(new A000004(), 1, 1, 3, 3, 6, 3, 3, 1, 1);
  }
}

