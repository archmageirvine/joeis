package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157670 a(n) = 531441*n^2 - 322218*n + 48842.
 * @author Sean A. Irvine
 */
public class A157670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157670() {
    super(1, new long[] {1, -3, 3}, new long[] {258065, 1530170, 3865157});
  }
}
