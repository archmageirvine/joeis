package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168830 Number of reduced words of length n in Coxeter group on 9 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^20 =</code> I.
 * @author Sean A. Irvine
 */
public class A168830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168830() {
    super(new long[] {-28, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7}, new long[] {9, 72, 576, 4608, 36864, 294912, 2359296, 18874368, 150994944, 1207959552, 9663676416L, 77309411328L, 618475290624L, 4947802324992L, 39582418599936L, 316659348799488L, 2533274790395904L, 20266198323167232L, 162129586585337856L, 1297036692682702812L}, 1);
  }
}
