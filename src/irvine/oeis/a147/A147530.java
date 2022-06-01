package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A147530 Numbers x such that there exists n in N : (x+1)^3 - x^3 = 103*n^2.
 * @author Sean A. Irvine
 */
public class A147530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147530() {
    super(new long[] {1, -128405450991L, 128405450991L},
      new Z[] {
        Z.valueOf(51721),
        Z.valueOf(6641322533431006L),
        new Z("852782015075257741682069713")
    });
  }
}
