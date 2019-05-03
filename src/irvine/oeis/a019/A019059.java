package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019059 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite RHO = Rho <code>(Na,Cs)12[ Al12Si36O96 ] . 44 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019059 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // RHO
    return "a-1: a-22(000) a-21(000) a-19(000) a-9(000)\n"
      + "a-9: a-16(000) a-12(000)\n"
      + "a-2: a-23(000) a-17(00-) a-13(000) a-9(000)\n"
      + "a-13: a-16(000) a-15(+00)\n"
      + "a-3: a-24(0-0) a-18(000) a-17(000) a-7(000)\n"
      + "a-7: a-12(000) a-11(000)\n"
      + "a-4: a-20(000) a-19(00+) a-18(000) a-14(-00)\n"
      + "a-5: a-17(000) a-14(000) a-13(00+) a-7(000)\n"
      + "a-6: a-23(0+0) a-21(000) a-20(00-) a-19(000)\n"
      + "a-11: a-22(000) a-20(000) a-18(000)\n"
      + "a-12: a-23(000) a-14(000)\n"
      + "a-8: a-23(000) a-21(0-0) a-18(+00) a-14(000)\n"
      + "a-16: a-24(+00) a-21(000)\n"
      + "a-10: a-24(000) a-22(000) a-20(000) a-17(0+0)\n"
      + "a-15: a-24(000) a-22(000) a-19(000)\n";
  }
}

