package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228606 The Merrifield-Simmons index of the para-polyphenylene chain of length n.
 * @author Sean A. Irvine
 */
public class A228606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228606() {
    super(new long[] {-7, 17}, new long[] {1, 18});
  }
}
