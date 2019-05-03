package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019186 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite MTT <code>= ZSM-23 Nan[ AlnSi24-nO48 ]</code>.
 * @author Sean A. Irvine
 */
public class A019186 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MTT
    return "a-1: f-6(000) e-5(000) c-3(+00) c-3(000)\n"
      + "c-3: e-12(000)\n"
      + "e-5: c-10(000)\n"
      + "f-6: a-15(0-0) g-7(+00) g-7(000)\n"
      + "b-2: b-9(00+) b-9(-0+) d-4(00+) c-3(000)\n"
      + "d-4: g-7(000) e-5(000) e-5(-00)\n"
      + "b-9: d-11(00-) c-10(000)\n"
      + "g-7: d-18(0-0)\n"
      + "a-15: e-19(000) c-17(+00) c-17(000)\n"
      + "d-18: e-19(000) e-19(-00)\n"
      + "a-8: f-13(000) e-12(000) c-10(000) c-10(-00)\n"
      + "f-13: a-20(000) g-14(000) g-14(-00)\n"
      + "d-11: g-14(000) e-12(+00) e-12(000)\n"
      + "g-14: d-23(000)\n"
      + "a-20: e-24(000) c-22(000) c-22(-00)\n"
      + "d-23: e-24(+00) e-24(000)\n"
      + "c-17: e-24(000)\n"
      + "e-19: c-22(000)\n"
      + "b-16: b-21(00+) b-21(-0+) d-18(00+) c-17(000)\n"
      + "b-21: d-23(00-) c-22(000)\n";
  }
}

