package irvine.oeis.a018;

/**
 * A018955 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AFI <code>= AlPO4-5 [ Al12P12O48 ]</code> . R . q <code>H2O</code>.
 * @author Sean A. Irvine
 */
public class A018955 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFI
    return "a-1: a-16(00-) a-12(000) a-10(000) a-9(000)\n"
      + "a-9: a-22(000)\n"
      + "a-10: a-21(000)\n"
      + "a-12: a-20(000)\n"
      + "a-16: a-22(000) a-21(000) a-20(000)\n"
      + "a-2: a-17(00-) a-11(-00) a-9(000) a-7(000)\n"
      + "a-7: a-23(000)\n"
      + "a-11: a-19(000)\n"
      + "a-17: a-23(000) a-22(000) a-19(-00)\n"
      + "a-3: a-18(00-) a-12(000) a-11(000) a-8(0-0)\n"
      + "a-8: a-24(000)\n"
      + "a-18: a-24(0-0) a-20(000) a-19(000)\n"
      + "a-4: a-13(00-) a-10(000) a-9(000) a-8(000)\n"
      + "a-13: a-24(000) a-22(000) a-21(000)\n"
      + "a-5: a-14(00-) a-11(000) a-10(000) a-7(+00)\n"
      + "a-14: a-23(+00) a-21(000) a-19(000)\n"
      + "a-6: a-15(00-) a-12(0+0) a-8(000) a-7(000)\n"
      + "a-15: a-24(000) a-23(000) a-20(0+0)\n";
  }
}

