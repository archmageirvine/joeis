package irvine.oeis.a220;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A220983 The left Aurifeuillian factor of 7^(14n+7) + 1.
 * @author Sean A. Irvine
 */
public class A220983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220983() {
    super(new long[] {558545864083284007L, -651636050170246351L, 95029449572634843L, -1944931485075299L, 5670354183893L, -2354918349L, 137257},
      new Z[] {
        Z.valueOf(113),
        Z.valueOf(34925927),
        Z.valueOf(4651514210561L),
        Z.valueOf(556919483179733591L),
        new Z("65684998500756890925713"),
        new Z("7730533744900130305342957127"),
        new Z("909535949164303794596648514307361")
      });
  }
}
