package irvine.oeis.a018;

/**
 * A018988 Cycle class sequence <code>c(2n) (the</code> number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite ATT <code>= AlPO4-12-TAMU [ Al12P12O48 ] . 4</code> R.
 * @author Sean A. Irvine
 */
public class A018988 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ATT
    return "a-1: b-12(000) a-7(-0-) a-3(000) b-2(000)\n"
      + "b-2: b-12(0-0) b-11(000) b-8(-00)\n"
      + "a-3: b-11(000) a-5(00-) b-4(000)\n"
      + "a-7: b-9(000) b-8(000)\n"
      + "b-8: b-10(000) b-9(0-0)\n"
      + "b-4: b-12(000) b-11(0+0) b-6(000)\n"
      + "a-5: b-10(000) a-7(000) b-6(000)\n"
      + "b-6: b-10(0+0) b-9(000)\n"
      + "b-10: b-11(000)\n"
      + "b-9: b-12(+00)\n";
  }
}

