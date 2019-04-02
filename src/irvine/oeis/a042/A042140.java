package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042140 Numerators of continued fraction convergents to sqrt(595).
 * @author Sean A. Irvine
 */
public class A042140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042140() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 37028, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {24, 49, 73, 122, 561, 683, 3293, 3976, 7269, 18514, 895941, 1810396, 2706337, 4516733, 20773269, 25290002, 121933277, 147223279, 269156556, 685536391});
  }
}
