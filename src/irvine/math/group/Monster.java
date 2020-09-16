package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a007.A007243;
import irvine.oeis.a007.A007244;
import irvine.oeis.a007.A007245;
import irvine.oeis.a007.A007246;
import irvine.oeis.a007.A007247;
import irvine.oeis.a007.A007248;
import irvine.oeis.a007.A007249;
import irvine.oeis.a007.A007251;
import irvine.oeis.a007.A007252;
import irvine.oeis.a007.A007254;
import irvine.oeis.a007.A007255;
import irvine.oeis.a007.A007256;
import irvine.oeis.a007.A007257;
import irvine.oeis.a007.A007258;
import irvine.oeis.a007.A007259;
import irvine.oeis.a007.A007264;
import irvine.oeis.a007.A007265;
import irvine.oeis.a007.A007266;
import irvine.oeis.a014.A014708;
import irvine.oeis.a022.A022597;
import irvine.oeis.a022.A022599;
import irvine.oeis.a022.A022601;
import irvine.oeis.a029.A029839;
import irvine.oeis.a029.A029841;
import irvine.oeis.a034.A034319;
import irvine.oeis.a034.A034322;
import irvine.oeis.a052.A052240;
import irvine.oeis.a052.A052241;
import irvine.oeis.a058.A058091;
import irvine.oeis.a058.A058097;
import irvine.oeis.a058.A058098;
import irvine.oeis.a058.A058099;
import irvine.oeis.a058.A058100;
import irvine.oeis.a058.A058101;
import irvine.oeis.a058.A058205;
import irvine.oeis.a058.A058206;
import irvine.oeis.a058.A058483;
import irvine.oeis.a058.A058484;
import irvine.oeis.a058.A058485;
import irvine.oeis.a058.A058486;
import irvine.oeis.a058.A058487;
import irvine.oeis.a058.A058496;
import irvine.oeis.a058.A058497;
import irvine.oeis.a058.A058503;
import irvine.oeis.a058.A058504;
import irvine.oeis.a058.A058508;
import irvine.oeis.a058.A058509;
import irvine.oeis.a058.A058510;
import irvine.oeis.a058.A058511;
import irvine.oeis.a058.A058514;
import irvine.oeis.a058.A058516;
import irvine.oeis.a058.A058530;
import irvine.oeis.a058.A058531;
import irvine.oeis.a058.A058532;
import irvine.oeis.a058.A058533;
import irvine.oeis.a058.A058535;
import irvine.oeis.a058.A058549;
import irvine.oeis.a058.A058551;
import irvine.oeis.a058.A058553;
import irvine.oeis.a058.A058554;
import irvine.oeis.a058.A058555;
import irvine.oeis.a058.A058563;
import irvine.oeis.a058.A058564;
import irvine.oeis.a058.A058565;
import irvine.oeis.a058.A058566;
import irvine.oeis.a058.A058567;
import irvine.oeis.a058.A058568;
import irvine.oeis.a058.A058570;
import irvine.oeis.a058.A058571;
import irvine.oeis.a058.A058572;
import irvine.oeis.a058.A058573;
import irvine.oeis.a058.A058574;
import irvine.oeis.a058.A058576;
import irvine.oeis.a058.A058578;
import irvine.oeis.a058.A058579;
import irvine.oeis.a058.A058594;
import irvine.oeis.a058.A058596;
import irvine.oeis.a058.A058597;
import irvine.oeis.a058.A058599;
import irvine.oeis.a058.A058606;
import irvine.oeis.a058.A058608;
import irvine.oeis.a058.A058609;
import irvine.oeis.a058.A058611;
import irvine.oeis.a058.A058612;
import irvine.oeis.a058.A058613;
import irvine.oeis.a058.A058614;
import irvine.oeis.a058.A058615;
import irvine.oeis.a058.A058616;
import irvine.oeis.a058.A058617;
import irvine.oeis.a058.A058618;
import irvine.oeis.a058.A058628;
import irvine.oeis.a058.A058629;
import irvine.oeis.a058.A058630;
import irvine.oeis.a058.A058636;
import irvine.oeis.a058.A058637;
import irvine.oeis.a058.A058638;
import irvine.oeis.a058.A058640;
import irvine.oeis.a058.A058641;
import irvine.oeis.a058.A058644;
import irvine.oeis.a058.A058646;
import irvine.oeis.a058.A058647;
import irvine.oeis.a058.A058657;
import irvine.oeis.a058.A058659;
import irvine.oeis.a058.A058660;
import irvine.oeis.a058.A058661;
import irvine.oeis.a058.A058662;
import irvine.oeis.a058.A058664;
import irvine.oeis.a058.A058670;
import irvine.oeis.a058.A058671;
import irvine.oeis.a058.A058672;
import irvine.oeis.a058.A058674;
import irvine.oeis.a058.A058679;
import irvine.oeis.a058.A058684;
import irvine.oeis.a058.A058688;
import irvine.oeis.a058.A058689;
import irvine.oeis.a058.A058690;
import irvine.oeis.a058.A058691;
import irvine.oeis.a058.A058701;
import irvine.oeis.a058.A058704;
import irvine.oeis.a058.A058705;
import irvine.oeis.a058.A058706;
import irvine.oeis.a058.A058708;
import irvine.oeis.a058.A058713;
import irvine.oeis.a058.A058714;
import irvine.oeis.a058.A058724;
import irvine.oeis.a058.A058725;
import irvine.oeis.a058.A058726;
import irvine.oeis.a058.A058727;
import irvine.oeis.a058.A058728;
import irvine.oeis.a058.A058729;
import irvine.oeis.a058.A058736;
import irvine.oeis.a058.A058739;
import irvine.oeis.a058.A058740;
import irvine.oeis.a058.A058742;
import irvine.oeis.a058.A058743;
import irvine.oeis.a058.A058744;
import irvine.oeis.a058.A058745;
import irvine.oeis.a058.A058754;
import irvine.oeis.a058.A058755;
import irvine.oeis.a058.A058758;
import irvine.oeis.a058.A058762;
import irvine.oeis.a058.A058768;
import irvine.oeis.a058.A058769;
import irvine.oeis.a058.A058773;
import irvine.oeis.a058.A058774;
import irvine.oeis.a058.A058776;
import irvine.oeis.a062.A062242;
import irvine.oeis.a062.A062244;
import irvine.oeis.a096.A096938;
import irvine.oeis.a097.A097793;
import irvine.oeis.a101.A101127;
import irvine.oeis.a101.A101558;
import irvine.oeis.a102.A102314;
import irvine.oeis.a107.A107080;
import irvine.oeis.a112.A112142;
import irvine.oeis.a112.A112143;
import irvine.oeis.a112.A112147;
import irvine.oeis.a112.A112148;
import irvine.oeis.a112.A112158;
import irvine.oeis.a112.A112159;
import irvine.oeis.a112.A112160;
import irvine.oeis.a112.A112161;
import irvine.oeis.a112.A112169;
import irvine.oeis.a112.A112179;
import irvine.oeis.a112.A112199;
import irvine.oeis.a112.A112211;
import irvine.oeis.a112.A112212;
import irvine.oeis.a112.A112213;
import irvine.oeis.a112.A112216;
import irvine.oeis.a112.A112217;
import irvine.oeis.a112.A112219;
import irvine.oeis.a335.A335798;
import irvine.util.io.IOUtils;

/**
 * Functions and constants associated with the Monster group.  Several methods here refer
 * to the 194 conjugacy classes of the Monster and such methods are indexed according
 * to their order in the "Atlas".
 * @author Sean A. Irvine
 */
public final class Monster {

  // The Monster is a group of large order.  This is not a proper group implementation but
  // provides methods useful for computing various sequences related to this group.

  private Monster() { }

  /** Order of the Monster. */
  public static final Z ORDER = new Z("808017424794512875886459904961710757005754368000000000");
  private static final int NUMBER_CHARACTERS = 194;

  private static final FiniteSequence CM = new A335798();

  /**
   * Return the order of the centralizer for the specified conjugacy class.
   * See "Atlas"
   * @param characterNumber class
   * @return centralizer order
   */
  public static Z centralizerOrder(final int characterNumber) {
    return CM.a(characterNumber - 1);
  }

  private static List<Z> sChi = null;

  private static List<Z> suckInNumbers(final String res) {
    try (final BufferedReader reader = new BufferedReader(IOUtils.reader(res))) {
      return ZUtils.suckInNumbers(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Return a character element of the Monster according to "Atlas" order.
   * @param characterNumber the character <code>[1..194]</code>
   * @param index index within character <code>[1..194]</code>
   * @return the character
   */
  public static Z chi(final int characterNumber, final int index) {
    if (characterNumber < 1 || index < 1 || characterNumber > NUMBER_CHARACTERS || index > NUMBER_CHARACTERS) {
      throw new IllegalArgumentException();
    }
    if (sChi == null) {
      sChi = suckInNumbers("irvine/math/group/resources/monster-chi.dat");
    }
    return sChi.get((characterNumber - 1) * NUMBER_CHARACTERS + index - 1);
  }

  private static final String[] CLASSES = {"1A", "2A", "2B", "3A", "3B", "3C", "4A", "4B", "4C", "4D", "5A", "5B", "6A", "6B", "6C", "6D", "6E", "6F", "7A", "7B", "8A", "8B", "8C", "8D", "8E", "8F", "9A", "9B", "10A", "10B", "10C", "10D", "10E", "11A", "12A", "12B", "12C", "12D", "12E", "12F", "12G", "12H", "12I", "12J", "13A", "13B", "14A", "14B", "14C", "15A", "15B", "15C", "15D", "16A", "16B", "16C", "17A", "18A", "18B", "18C", "18D", "18E", "19A", "20A", "20B", "20C", "20D", "20E", "20F", "21A", "21B", "21C", "21D", "22A", "22B", "23AB", "23AB", "24A", "24B", "24C", "24D", "24E", "24F", "24G", "24H", "24I", "24J", "25A", "26A", "26B", "27A", "27B", "28A", "28B", "28C", "28D", "29A", "30A", "30B", "30C", "30D", "30E", "30F", "30G", "31AB", "31AB", "32A", "32B", "33A", "33B", "34A", "35A", "35B", "36A", "36B", "36C", "36D", "38A", "39A", "39B", "39CD", "39CD", "40A", "40B", "40CD", "40CD", "41A", "42A", "42B", "42C", "42D", "44AB", "44AB", "45A", "46AB", "46AB", "46CD", "46CD", "47AB", "47AB", "48A", "50A", "51A", "52A", "52B", "54A", "55A", "56A", "56BC", "56BC", "57A", "59AB", "59AB", "60A", "60B", "60C", "60D", "60E", "60F", "62AB", "62AB", "66A", "66B", "68A", "69AB", "69AB", "70A", "70B", "71AB", "71AB", "78A", "78BC", "78BC", "84A", "84B", "84C", "87AB", "87AB", "88AB", "88AB", "92AB", "92AB", "93AB", "93AB", "94AB", "94AB", "95AB", "95AB", "104AB", "104AB", "105A", "110A", "119AB", "119AB"};
  private static final Map<String, Integer> CLASS_TO_CHARACTER_NUMBER = new HashMap<>();
  static {
    int j = 0;
    for (final String c : CLASSES) {
      CLASS_TO_CHARACTER_NUMBER.put(c, ++j);
    }
  }

  private static final MemorySequence MT_23AB = MemorySequence.cachedSequence(new A058570());
  private static final MemorySequence MT_27AB = MemorySequence.cachedSequence(new A058599());
  private static final MemorySequence MT_31AB = MemorySequence.cachedSequence(new A058628());
  private static final MemorySequence MT_39CD = MemorySequence.cachedSequence(new A058661());
  private static final MemorySequence MT_40CD = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058664(), 1));
  private static final MemorySequence MT_44AB = MemorySequence.cachedSequence(new A058679());
  private static final MemorySequence MT_46AB = MemorySequence.cachedSequence(new A058688());
  private static final MemorySequence MT_46CD = MemorySequence.cachedSequence(new A058689());
  private static final MemorySequence MT_47AB = MemorySequence.cachedSequence(new A058690());
  private static final MemorySequence MT_56BC = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A097793(), 3));
  private static final MemorySequence MT_59AB = MemorySequence.cachedSequence(new A058724());
  private static final MemorySequence MT_62AB = MemorySequence.cachedSequence(new A058736());
  private static final MemorySequence MT_69AB = MemorySequence.cachedSequence(new A058743());
  private static final MemorySequence MT_71AB = MemorySequence.cachedSequence(new A034322());
  private static final MemorySequence MT_78BC = MemorySequence.cachedSequence(new A058755());
  private static final MemorySequence MT_87AB = MemorySequence.cachedSequence(new A058762());
  private static final MemorySequence MT_88AB = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112213(), 1));
  private static final MemorySequence MT_92AB = MemorySequence.cachedSequence(new A112216());
  private static final MemorySequence MT_93AB = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112217(), 2));
  private static final MemorySequence MT_94AB = MemorySequence.cachedSequence(new A058768());
  private static final MemorySequence MT_104AB = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112219(), 3));
  private static final MemorySequence MT_119AB = MemorySequence.cachedSequence(new A058776());

  // ATLAS order
  private static final MemorySequence[] MCKAY_THOMPSON_SERIES = {
    MemorySequence.cachedSequence(new A014708()),  // 1A, 1
    MemorySequence.cachedSequence(new A101558()),  // 2A, 2
    MemorySequence.cachedSequence(new A007246()),  // 2B, 3
    MemorySequence.cachedSequence(new A007243()),  // 3A, 4
    MemorySequence.cachedSequence(new A007244()),  // 3B, 5
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A007245(), 2)),  // 3C, 6
    MemorySequence.cachedSequence(new A107080()),  // 4A, 7
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A007247(), 1)),  // 4B, 8
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A007248(), 1)),  // 4C, 9
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A007249(), 1)),  // 4D, 10
    MemorySequence.cachedSequence(new A007251()),  // 5A, 11
    MemorySequence.cachedSequence(new A007252()),  // 5B, 12
    MemorySequence.cachedSequence(new A007254()),  // 6A, 13
    MemorySequence.cachedSequence(new A007255()),  // 6B, 14
    MemorySequence.cachedSequence(new A007256()),  // 6C, 15
    MemorySequence.cachedSequence(new A007257()),  // 6D, 16
    MemorySequence.cachedSequence(new A007258()),  // 6E, 17
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A007259(), 2)),  // 6F, 18
    MemorySequence.cachedSequence(new A007264()),  // 7A, 19
    MemorySequence.cachedSequence(new A052240()),  // 7B, 20
    MemorySequence.cachedSequence(new A007265()),  // 8A, 21
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112142(), 1)),  // 8B, 22
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A052241(), 3)),  // 8C, 23
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112143(), 1)),  // 8D, 24
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A029841(), 1)),  // 8E, 25
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A022601(), 3)),  // 8F, 26
    MemorySequence.cachedSequence(new A007266()),  // 9A, 27
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058091(), 2)),  // 9B, 28
    MemorySequence.cachedSequence(new A058097()),  // 10A, 29
    MemorySequence.cachedSequence(new A058098()),  // 10B, 30
    MemorySequence.cachedSequence(new A058099()),  // 10C, 31
    MemorySequence.cachedSequence(new A058100()),  // 10D, 32
    MemorySequence.cachedSequence(new A058101()),  // 10E, 33
    MemorySequence.cachedSequence(new A058205()),  // 11A, 34
    MemorySequence.cachedSequence(new A112147()),  // 12A, 35
    MemorySequence.cachedSequence(new A112148()),  // 12B, 36
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058206(), 1)),  // 12C, 37
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A101127(), 2)),  // 12D, 38
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058483(), 1)),  // 12E, 39
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058484(), 1)),  // 12F, 40
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058485(), 1)),  // 12G, 41
    MemorySequence.cachedSequence(new A058486()),  // 12H, 42
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058487(), 1)),  // 12I, 43
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A022599(), 5)),  // 12J, 44
    MemorySequence.cachedSequence(new A034319()),  // 13A, 45
    MemorySequence.cachedSequence(new A058496()),  // 13B, 46
    MemorySequence.cachedSequence(new A058497()),  // 14A, 47
    MemorySequence.cachedSequence(new A058503()),  // 14B, 48
    MemorySequence.cachedSequence(new A058504()),  // 14C, 49
    MemorySequence.cachedSequence(new A058508()),  // 15A, 50
    MemorySequence.cachedSequence(new A058509()),  // 15B, 51
    MemorySequence.cachedSequence(new A058510()),  // 15C, 52
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058511(), 2)),  // 15D, 53
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058514(), 1)),  // 16A, 54
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A029839(), 3)),  // 16B, 55
    MemorySequence.cachedSequence(new A058516()),  // 16C, 56
    MemorySequence.cachedSequence(new A058530()),  // 17A, 57
    MemorySequence.cachedSequence(new A058531()),  // 18A, 58
    MemorySequence.cachedSequence(new A058532()),  // 18B, 59
    MemorySequence.cachedSequence(new A058533()),  // 18C, 60
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A062242(), 2)),  // 18D, 61
    MemorySequence.cachedSequence(new A058535()),  // 18E, 62
    MemorySequence.cachedSequence(new A058549()),  // 19A, 63
    MemorySequence.cachedSequence(new A112158()),  // 20A, 64
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058551(), 2)),  // 20B, 65
    MemorySequence.cachedSequence(new A112159()),  // 20C, 66
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058553(), 2)),  // 20D, 67
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058554(), 2)),  // 20E, 68
    MemorySequence.cachedSequence(new A058555()),  // 20F, 69
    MemorySequence.cachedSequence(new A058563()),  // 21A, 70
    MemorySequence.cachedSequence(new A058564()),  // 21B, 71
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058565(), 2)),  // 21C, 72
    MemorySequence.cachedSequence(new A058566()),  // 21D, 73
    MemorySequence.cachedSequence(new A058567()),  // 22A, 74
    MemorySequence.cachedSequence(new A058568()),  // 22B, 75
    MT_23AB, // 23A, 76
    MT_23AB, // 23B, 77
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058571(), 1)),  // 24A, 78
    MemorySequence.cachedSequence(new A058572()),  // 24B, 79
    MemorySequence.cachedSequence(new A058573()),  // 24C, 80
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058574(), 1)),  // 24D, 81
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112160(), 5)),  // 24E, 82
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058576(), 3)),  // 24F, 83
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112161(), 3)),  // 24G, 84
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058578(), 1)),  // 24H, 85
    MemorySequence.cachedSequence(new A058579()),  // 24I, 86
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A022597(), 11)),  // 24J, 87
    MemorySequence.cachedSequence(new A058594()),  // 25A, 88
    MemorySequence.cachedSequence(new A058596()),  // 26A, 89
    MemorySequence.cachedSequence(new A058597()),  // 26B, 90
    MT_27AB,  // 27A, 91
    MT_27AB,  // 27B, 92
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058606(), 1)),  // 28A, 93
    MemorySequence.cachedSequence(new A112169()),  // 28B, 94
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058608(), 1)),  // 28C, 95
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058609(), 1)),  // 28D, 96
    MemorySequence.cachedSequence(new A058611()),  // 29A, 97
    MemorySequence.cachedSequence(new A058612()),  // 30A, 98
    MemorySequence.cachedSequence(new A058613()),  // 30B, 99
    MemorySequence.cachedSequence(new A058614()),  // 30C, 100
    MemorySequence.cachedSequence(new A058615()),  // 30D, 101
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058616(), 2)),  // 30E, 102
    MemorySequence.cachedSequence(new A058617()),  // 30F, 103
    MemorySequence.cachedSequence(new A058618()),  // 30G, 104
    MT_31AB, // 31A, 105
    MT_31AB, // 31B, 106
    MemorySequence.cachedSequence(new A058629()),  // 32A, 107
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058630(), 1)),  // 32B, 108
    MemorySequence.cachedSequence(new A058636()),  // 33A, 109
    MemorySequence.cachedSequence(new A058637()),  // 33B, 110
    MemorySequence.cachedSequence(new A058638()),  // 34A, 111
    MemorySequence.cachedSequence(new A058640()),  // 35A, 112
    MemorySequence.cachedSequence(new A058641()),  // 35B, 113
    MemorySequence.cachedSequence(new A058644()),  // 36A, 114
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A062244(), 2)),  // 36B, 115
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058646(), 1)),  // 36C, 116
    MemorySequence.cachedSequence(new A058647()),  // 36D, 117
    MemorySequence.cachedSequence(new A058657()),  // 38A, 118
    MemorySequence.cachedSequence(new A058659()),  // 39A, 119
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058660(), 2)),  // 39B, 120
    MT_39CD, // 39C, 121
    MT_39CD, // 39D, 122
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058662(), 2)),  // 40A, 123
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112179(), 1)),  // 40B, 124
    MT_40CD, // 40C, 125
    MT_40CD, // 40D, 126
    MemorySequence.cachedSequence(new A058670()),  // 41A, 127
    MemorySequence.cachedSequence(new A058671()),  // 42A, 128
    MemorySequence.cachedSequence(new A058672()),  // 42B, 129
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A102314(), 2)),  // 42C, 130
    MemorySequence.cachedSequence(new A058674()),  // 42D, 131
    MT_44AB, // 44A, 132
    MT_44AB, // 44B, 133
    MemorySequence.cachedSequence(new A058684()),  // 45A, 134
    MT_46AB, // 46A, 135
    MT_46AB, // 46B, 136
    MT_46CD, // 46C, 137
    MT_46CD, // 46D, 138
    MT_47AB, // 47A, 139
    MT_47AB, // 47B, 140
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058691(), 1)),  // 48A, 141
    MemorySequence.cachedSequence(new A058701()),  // 50A, 142
    MemorySequence.cachedSequence(new A058704()),  // 51A, 143
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058705(), 1)),  // 52A, 144
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058706(), 1)),  // 52B, 145
    MemorySequence.cachedSequence(new A058708()),  // 54A, 146
    MemorySequence.cachedSequence(new A058713()),  // 55A, 147
    MemorySequence.cachedSequence(new A058714()),  // 56A, 148
    MT_56BC,  // 56B, 149
    MT_56BC,  // 56C, 150
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112199(), 2)),  // 57A, 151
    MT_59AB, // 59A, 152
    MT_59AB, // 59B, 153
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058725(), 1)),  // 60A, 154
    MemorySequence.cachedSequence(new A058726()),  // 60B, 155
    MemorySequence.cachedSequence(new A058727()),  // 60C, 156
    MemorySequence.cachedSequence(new A058728()),  // 60D, 157
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058729(), 1)),  // 60E, 158
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A096938(), 5)),  // 60F, 159
    MT_62AB, // 62A, 160
    MT_62AB, // 62B, 161
    MemorySequence.cachedSequence(new A058739()),  // 66A, 162
    MemorySequence.cachedSequence(new A058740()),  // 66B, 163
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058742(), 1)),  // 68A, 164
    MT_69AB, // 69A, 165
    MT_69AB, // 69B, 166
    MemorySequence.cachedSequence(new A058744()),  // 70A, 167
    MemorySequence.cachedSequence(new A058745()),  // 70B, 168
    MT_71AB, // 71A, 169
    MT_71AB, // 71B, 170
    MemorySequence.cachedSequence(new A058754()),  // 78A, 171
    MT_78BC,  // 78B, 172
    MT_78BC,  // 78C, 173
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A058758(), 1)),  // 84A, 174
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112211(), 1)),  // 84B, 175
    MemorySequence.cachedSequence(new ZeroSpacedSequence(new A112212(), 2)),  // 84C, 176
    MT_87AB, // 87A, 177
    MT_87AB, // 87B, 178
    MT_88AB, // 88A, 179
    MT_88AB, // 88B, 180
    MT_92AB, // 92A, 181
    MT_92AB, // 92B, 182
    MT_93AB, // 93A, 183
    MT_93AB, // 93B, 184
    MT_94AB, // 94A, 185
    MT_94AB, // 94B, 186
    MemorySequence.cachedSequence(new A058769()),  // 95A, 187
    MemorySequence.cachedSequence(new A058769()),  // 95B, 188
    MT_104AB, // 104A, 189
    MT_104AB, // 104B, 190
    MemorySequence.cachedSequence(new A058773()),  // 105A, 191
    MemorySequence.cachedSequence(new A058774()),  // 110A, 192
    MT_119AB, // 119A, 193
    MT_119AB, // 119B, 194
  };

  /**
   * Return a (cached) version of the McKay-Thompson sequence of the given class number,
   * in "Atlas" order. These versions have 0 for the constant coefficient.
   * @param index class <code>[1..194]</code>
   * @return sequence
   */
  public static MemorySequence mckayThompson(final int index) {
    return MCKAY_THOMPSON_SERIES[index - 1];
  }
}
