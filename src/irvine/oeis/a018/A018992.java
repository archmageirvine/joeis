package irvine.oeis.a018;

/**
 * A018992 Cycle class sequence <code>c(2n) (the</code> number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AWW <code>= AlPO4-22 [ Al24P24O96 ] . 2</code> R.
 * @author Sean A. Irvine
 */
public class A018992 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AWW
    return "a-1: a-23(0+0) a-22(000) b-16(000) a-11(00+)\n"
      + "a-11: a-19(000) b-16(000) a-13(0+0)\n"
      + "b-2: a-21(000) b-20(000) a-19(000) b-16(000)\n"
      + "a-19: a-21(00-)\n"
      + "a-3: a-24(000) a-22(000) b-18(000) a-10(00+)\n"
      + "a-10: b-18(000) a-15(000) a-13(000)\n"
      + "b-4: a-23(000) b-18(000) b-14(000) a-13(000)\n"
      + "a-13: a-23(00-)\n"
      + "a-5: a-24(-00) a-21(000) b-20(000) a-12(00+)\n"
      + "a-12: b-20(000) a-17(-00) a-15(000)\n"
      + "b-6: a-22(000) b-20(000) b-16(000) a-15(000)\n"
      + "a-15: a-22(00-)\n"
      + "a-7: a-23(000) a-21(+-0) b-14(000) a-9(00+)\n"
      + "a-9: a-19(+-0) a-17(000) b-14(000)\n"
      + "b-8: a-24(000) b-18(000) a-17(000) b-14(000)\n"
      + "a-17: a-24(00-)\n";
  }
}

