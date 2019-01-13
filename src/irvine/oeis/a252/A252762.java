package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252762.
 * @author Sean A. Irvine
 */
public class A252762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252762() {
    super(new long[] {1, -195, 195}, new long[] {3, 853, 165735});
  }
}
