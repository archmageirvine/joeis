package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A068220.
 * @author Sean A. Irvine
 */
public class A068243 extends Sequence2 {

  private static final Z[] COEFFS = {
    Z.ONE,
    Z.valueOf(-83),
    Z.valueOf(3403),
    Z.valueOf(-91845),
    Z.valueOf(1834740),
    Z.valueOf(-28920636),
    Z.valueOf(374490018),
    Z.valueOf(-4095030233L),
    Z.valueOf(38579627945L),
    Z.valueOf(-317921562495L),
    Z.valueOf(2318821018935L),
    Z.valueOf(-15110691435173L),
    Z.valueOf(88651172200752L),
    Z.valueOf(-471184617374802L),
    Z.valueOf(2280683800579812L),
    Z.valueOf(-10097088693333147L),
    Z.valueOf(41036493964957688L),
    Z.valueOf(-153574643888930248L),
    Z.valueOf(530591824124255314L),
    Z.valueOf(-1695990135001213221L),
    Z.valueOf(5024274322197575906L),
    new Z("-13814289476482492976"),
    new Z("35291642825233986557"),
    new Z("-83841738925018752398"),
    new Z("185323611899400429750"),
    new Z("-381244501172243391898"),
    new Z("729932965127085456505"),
    new Z("-1300334541431247381386"),
    new Z("2154187046551418697204"),
    new Z("-3315896168975295792836"),
    new Z("4736951678453107320366"),
    new Z("-6270636397372409074264"),
    new Z("7677061155567094341429"),
    new Z("-8671604666818720456947"),
    new Z("9010169033011718007378"),
    new Z("-8580483983724563093716"),
    new Z("7455806774758120404972"),
    new Z("-5878840022567954774086"),
    new Z("4177701909071209829521"),
    new Z("-2652828308301600360103"),
    new Z("1488868918765379224609"),
    new Z("-728091582039199527813"),
    new Z("304359430257792445054"),
    new Z("-105891275255837355729"),
    new Z("29477940569199375448"),
    new Z("-6163977459068192923"),
    Z.valueOf(861687525842228418L),
    Z.valueOf(-60466776520638151L),
  };
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z c : COEFFS) {
      sum = sum.multiply(mN).add(c);
    }
    return sum.multiply(mN).multiply(mN - 1).divide2();
  }
}
