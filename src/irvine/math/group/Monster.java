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
import irvine.oeis.a022.A022599;
import irvine.oeis.a022.A022601;
import irvine.oeis.a029.A029839;
import irvine.oeis.a029.A029841;
import irvine.oeis.a034.A034319;
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
import irvine.oeis.a062.A062242;
import irvine.oeis.a101.A101127;
import irvine.oeis.a101.A101558;
import irvine.oeis.a107.A107080;
import irvine.oeis.a112.A112142;
import irvine.oeis.a112.A112143;
import irvine.oeis.a112.A112147;
import irvine.oeis.a112.A112148;
import irvine.oeis.a112.A112158;
import irvine.oeis.a112.A112159;
import irvine.oeis.a335.A335798;
import irvine.util.io.IOUtils;

/**
 * Functions and constants associated with the Monster group.
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
