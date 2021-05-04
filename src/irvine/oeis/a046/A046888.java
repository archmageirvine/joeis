package irvine.oeis.a046;

import irvine.oeis.RecordPositionSequence;

/**
 * A046888 Number of anagrams of a(n) that are prime increases.
 * @author Sean A. Irvine
 */
public class A046888 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A046888() {
    super(new A046810(), 1);
  }
}
