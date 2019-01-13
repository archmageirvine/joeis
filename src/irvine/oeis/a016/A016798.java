package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016798.
 * @author Sean A. Irvine
 */
public class A016798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016798() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1024, 9765625, 1073741824, 25937424601L, 289254654976L, 2015993900449L, 10240000000000L, 41426511213649L, 141167095653376L, 420707233300201L, 1125899906842624L});
  }
}
