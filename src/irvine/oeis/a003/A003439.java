package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003439 Number of 6 X 6 stochastic matrices of integers: all rows and columns sum to n.
 * @author Sean A. Irvine
 */
public class A003439 implements Sequence {

  private static final Q[] EHRHART = {
    Q.ONE,
    new Q(3899, 600),
    new Q(46584105377L, 2141691552),
    new Q(12246206617138789L, 247365374256000L),
    new Q(382955230861099213L, 4517106834240000L),
    new Q(new Z("155498465793777230567"), new Z("1355132050272000000")),
    new Q(14226886368398551L, 112634352230400L),
    new Q(243245111626317349L, 2111894104320000L),
    new Q(232132948167689L, 2634721689600L),
    new Q(253578194011961479L, 4446092851200000L),
    new Q(736591080322991L, 23433524674560L),
    new Q(16265048187290869L, 1098446469120000L),
    new Q(2000221303490489L, 334764638208000L),
    new Q(570713692223620411L, 276180826521600000L),
    new Q(8346012436199L, 13638559334400L),
    new Q(1424745952102609L, 9206027550720000L),
    new Q(77984295979769L, 2343352467456000L),
    new Q(1062348478211833L, 175751435059200000L),
    new Q(18674864899L, 20324995891200L),
    new Q(2462417656967L, 21341245685760000L),
    new Q(141248912237L, 12014330904576000L),
    new Q(853529939221L, 901074817843200000L),
    new Q(4394656999L, 75690284698828800L),
    new Q(Z.valueOf(158824242127L), new Z("62444484876533760000")),
    new Q(Z.valueOf(9700106723L), new Z("136783157348597760000")),
    new Q(Z.valueOf(9700106723L), new Z("10258736801144832000000"))
  };

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int k = EHRHART.length - 1; k >= 0; --k) {
      s = s.multiply(mN);
      s = s.add(EHRHART[k]);
    }
    return s.toZ();
  }

}

