package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A258442 9-gonal numbers (A001106) that are the sum of eight consecutive 9-gonal numbers.
 * @author Sean A. Irvine
 */
public class A258442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258442() {
    super(new long[] {1, -1536796803, 1536796803},
      new Z[] {
        Z.valueOf(2484),
        Z.valueOf(3706711688304L),
        new Z("5696462668411740751524")
    });
  }
}
