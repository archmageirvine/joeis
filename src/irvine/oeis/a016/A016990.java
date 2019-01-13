package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016990.
 * @author Sean A. Irvine
 */
public class A016990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016990() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 282475249, 289254654976L, 16679880978201L, 296196766695424L, 2758547353515625L, 17080198121677824L, 79792266297612001L, 303305489096114176L, 984930291881790849L, 2824752490000000000L});
  }
}
