package irvine.oeis.a191;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A191319 Sum of pyramid weights of all dispersed Dyck paths of length n (i.e., of all Motzkin paths of length n with no (1,0) steps at positive heights).
 * @author Georg Fischer
 */
public class A191319 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A191319() {
    super(0, "[[0],[-8,4],[2],[10,-5],[-2],[-2,1]]", "0,0,1", 0);
  }
}
