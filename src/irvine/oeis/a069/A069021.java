package irvine.oeis.a069;

import irvine.oeis.PrependSequence;
import irvine.oeis.a045.A045882;

/**
 * A069021 Start of the first occurrence of n consecutive numbers divisible by a square greater than 1.
 * @author Sean A. Irvine
 */
public class A069021 extends PrependSequence {

  /** Construct the sequence. */
  public A069021() {
    super(1, new A045882().skip(), 1);
  }
}

