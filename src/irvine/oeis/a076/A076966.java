package irvine.oeis.a076;

import irvine.oeis.a001.A001597;
import irvine.oeis.a068.A068708;

/**
 * A076966 Perfect powers (index &gt; 1) whose digits can be arranged in ascending order or as a substring of 123456789012345678901234567890123...
 * @author Sean A. Irvine
 */
public class A076966 extends A068708 {

  /** Construct the sequence. */
  public A076966() {
    super(new A001597());
  }
}

