package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042852 Numerators of continued fraction convergents to sqrt(957).
 * @author Sean A. Irvine
 */
public class A042852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042852() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 29698, 0, 0, 0, 0, 0}, new long[] {30, 31, 464, 959, 13890, 14849, 904830, 919679, 13780336, 28480351, 412505250, 440985601});
  }
}
