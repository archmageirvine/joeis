package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A147528.
 * @author Sean A. Irvine
 */
public class A147528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147528() {
    super(new long[] {1, -128405450991L, 128405450991L},
      new Z[] {
        Z.valueOf(5327263),
        Z.valueOf(684056220943393618L),
        new Z("87836547552751547393253180439")
    });
  }
}
