package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A028480 Number of perfect matchings in graph C_{9} X P_{2n}.
 * @author Sean A. Irvine
 */
public class A028480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028480() {
    super(new long[] {-1, 265, -17736, 457655, -5699687, 38357160, -146975161, 327381265, -427427424, 327381265, -146975161, 38357160, -5699687, 457655, -17736, 265},
      new Z[] {
        Z.ONE,
        new Z("76"),
        new Z("11989"),
        new Z("2091817"),
        new Z("372713728"),
        new Z("66750320449"),
        new Z("11970180565381"),
        new Z("2147314732677364"),
        new Z("385238046548443177"),
        new Z("69115057977256578649"),
        new Z("12399917664600455876068"),
        new Z("2224670061782262303745381"),
        new Z("399128369515444836686385361"),
        new Z("71607684753022827432994707712"),
        new Z("12847146560245443644393642713369"),
        new Z("2304908705240472039218984995842421"),
      });
  }
}
