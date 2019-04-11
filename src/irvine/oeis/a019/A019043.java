package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019043 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite OFF = Offretite (Ca,Mg)1.5K[ Al4Si14O36 <code>] </code>. 14 H2O.
 * @author Sean A. Irvine
 */
public class A019043 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // OFF
    return "a-1: a-14(000) a-12(000) b-7(-00) b-2(-00)\n"
      + "b-2: b-18(000) b-16(+00) b-7(00-)\n"
      + "b-7: b-13(+00) b-11(000)\n"
      + "a-12: b-16(000) b-13(000)\n"
      + "a-14: b-17(-00) b-15(-00)\n"
      + "a-3: a-14(000) a-10(000) b-8(0+0) b-4(0+0)\n"
      + "b-4: b-15(--0) b-13(000) b-8(00+)\n"
      + "b-8: b-17(--0) b-16(000)\n"
      + "a-10: b-18(0+0) b-11(0+0)\n"
      + "b-13: b-16(00+)\n"
      + "b-15: b-17(00+)\n"
      + "a-5: a-12(000) a-10(000) b-9(000) b-6(000)\n"
      + "b-6: b-18(0+0) b-17(000) b-9(00-)\n"
      + "b-9: b-15(000) b-11(0+0)\n"
      + "b-11: b-18(00+)\n";
  }
}

