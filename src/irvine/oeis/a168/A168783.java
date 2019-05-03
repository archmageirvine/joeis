package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168783 Number of reduced words of length n in Coxeter group on 10 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^19 =</code> I.
 * @author Sean A. Irvine
 */
public class A168783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168783() {
    super(new long[] {-36, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, new long[] {10, 90, 810, 7290, 65610, 590490, 5314410, 47829690, 430467210, 3874204890L, 34867844010L, 313810596090L, 2824295364810L, 25418658283290L, 228767924549610L, 2058911320946490L, 18530201888518410L, 166771816996665690L, 1500946352969991165L}, 1);
  }
}
