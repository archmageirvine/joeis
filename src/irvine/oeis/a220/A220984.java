package irvine.oeis.a220;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A220984.
 * @author Sean A. Irvine
 */
public class A220984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220984() {
    super(new long[] {558545864083284007L, -651636050170246351L, 95029449572634843L, -1944931485075299L, 5670354183893L, -2354918349L, 137257},
      new Z[] {
        Z.valueOf(911),
        Z.valueOf(46489241),
        Z.valueOf(4845303761663L),
        Z.valueOf(560176314330212777L),
        new Z("65739735996793498937711"),
        new Z("7731453717973685046293120441"),
        new Z("909551411151743369070229385367263")
      });
  }
}
