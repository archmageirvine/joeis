package irvine.oeis.a069;

import irvine.oeis.PrependSequence;
import irvine.oeis.a063.A063528;

/**
 * A069022 Start of the first occurrence of two consecutive numbers divisible by an n-th power.
 * @author Sean A. Irvine
 */
public class A069022 extends PrependSequence {

  /** Construct the sequence. */
  public A069022() {
    super(1, new A063528().skip(), 1);
  }
}

