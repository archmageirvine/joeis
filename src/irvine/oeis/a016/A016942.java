package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016942 <code>a(n) = (6*n + 2)^10</code>.
 * @author Sean A. Irvine
 */
public class A016942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016942() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1024, 1073741824, 289254654976L, 10240000000000L, 141167095653376L, 1125899906842624L, 6278211847988224L, 27197360938418176L, 97656250000000000L, 303305489096114176L, 839299365868340224L});
  }
}
