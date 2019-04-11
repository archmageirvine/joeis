package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157670 <code>a(n) = 531441*n^2 - 322218*n + 48842</code>.
 * @author Sean A. Irvine
 */
public class A157670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157670() {
    super(new long[] {1, -3, 3}, new long[] {258065, 1530170, 3865157});
  }
}
