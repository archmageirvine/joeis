package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019045 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite PAR = Partheite <code>Ca8[ Al16Si16O60(OH)8 ] . 16 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019045 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // PAR
    return "a-1: b-14(-00) c-3(000) b-2(0-0)\n"
      + "b-2: a-13(0+0) b-6(000) d-4(000)\n"
      + "c-3: d-12(000) d-8(000) d-4(0-0)\n"
      + "b-14: d-16(000)\n"
      + "d-4: c-11(000) c-7(000)\n"
      + "b-6: a-9(-00) d-8(000)\n"
      + "a-13: c-15(00+) b-14(-0+)\n"
      + "d-8: c-15(00+)\n"
      + "d-12: c-15(000)\n"
      + "c-7: d-16(00+) d-8(+00)\n"
      + "c-11: d-16(000) d-12(0+0)\n"
      + "a-5: b-10(0+0) c-7(00-) b-6(+0-)\n"
      + "b-10: b-14(000) d-12(000)\n"
      + "a-9: c-11(000) b-10(0+0)\n"
      + "c-15: d-16(-00)\n";
  }
}

