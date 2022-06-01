package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016906 a(n) = (5*n + 4)^10.
 * @author Sean A. Irvine
 */
public class A016906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016906() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1048576, 3486784401L, 289254654976L, 6131066257801L, 63403380965376L, 420707233300201L, 2064377754059776L, 8140406085191601L, 27197360938418176L, 79792266297612001L, 210832519264920576L});
  }
}
