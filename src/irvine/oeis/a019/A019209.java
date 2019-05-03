package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019209 Cycle class sequence <code>c(n)</code> (number of true cycles of length n in which a certain node is included) for zeolite NON <code>= Nonasil-[ 4158 ] [ Si88O176 ] . 4</code> R.
 * @author Sean A. Irvine
 */
public class A019209 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // NON
    return "a-1: c-17(-00) d-14(-00) b-12(00-) a-11(000)\n"
      + "b-12: a-20(000) b-16(00+)\n"
      + "d-14: a-22(00-)\n"
      + "c-17: a-21(000)\n"
      + "b-2: a-22(-00) a-11(0+0) e-10(000) b-7(-+0)\n"
      + "b-7: a-21(0-0) a-15(+00)\n"
      + "e-10: d-18(000) b-12(000)\n"
      + "c-3: a-20(0-0) c-17(--+) a-15(00+) c-8(000)\n"
      + "c-8: a-19(-00) c-13(--+) a-11(000)\n"
      + "a-20: a-22(000)\n"
      + "d-4: a-20(0-0) d-18(0-0) a-11(000) e-5(000)\n"
      + "e-5: b-16(000) d-14(000) b-7(000)\n"
      + "d-18: a-21(000)\n"
      + "b-16: a-19(00-)\n"
      + "a-6: d-18(0-0) b-16(000) a-15(000) c-13(0-0)\n"
      + "c-13: a-22(00-) c-17(000)\n"
      + "a-19: a-21(000)\n"
      + "d-9: a-19(-00) a-15(00+) d-14(-0+) e-10(000)\n";
  }
}

