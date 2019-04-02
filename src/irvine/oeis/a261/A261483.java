package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261483 Number of set partitions of [n] into exactly seven parts such that no part contains two elements with a circular distance less than three.
 * @author Sean A. Irvine
 */
public class A261483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261483() {
    super(new long[] {14400, 14400, 11804, -9272, -17481, -12165, -7633, 3758, -19, 2795, -746, 405, -299, 70, -25, 9}, new long[] {1, 12, 102, 720, 4587, 27326, 155571, 858023, 4623388, 24488768, 128053146, 663054996, 3407483161L, 17409523182L, 88545747922L, 448749879028L});
  }
}
