package irvine.oeis.a038;

import irvine.oeis.CoordinationSequence;

/**
 * A038417 Coordination sequence <code>T4</code> for Zeolite Code STT.
 * @author Sean A. Irvine
 */
public class A038417 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038417() {
    super(
      new long[] {1, 4, 10, 19, 32, 55, 81, 108, 137, 164, 204, 245, 262, 278, 305, 336, 350, 340, 320, 317, 307, 283, 209, 160, 92, 3, -91, -216, -366, -513, -700, -850, -1035, -1207, -1459, -1642, -1778, -1905, -2147, -2260, -2394, -2396, -2456, -2516, -2579, -2356, -2267, -2149, -2060, -1653, -1383, -929, -713, -175, 427, 1124, 1479, 2187, 2853, 3791, 4284, 5049, 5569, 6634, 7160, 7786, 8208, 9062, 9357, 9944, 9904, 10439, 10491, 10554, 10062, 10132, 9616, 9273, 8067, 7438, 6327, 5588, 3842, 2259, 716, -624, -2759, -4565, -6973, -8678, -10766, -12949, -15330, -17227, -19312, -21373, -23216, -24923, -26590, -27955, -29158, -30283, -30420, -31332, -31357, -31201, -30264, -29735, -28172, -27192, -24514, -22657, -19387, -17452, -13098, -10149, -5553, -2197, 3036, 6617, 12726, 16066, 22213, 26087, 32169, 35573, 41590, 44729, 50543, 52905, 57985, 59604, 64392, 64937, 68064, 68027, 70273, 68832, 69840, 66644, 66629, 62695, 60773, 55163, 52137, 45817, 41201, 33642, 27753, 19327, 12986, 3642, -4106, -13190, -21556, -30735, -39334, -48453, -56841, -65201, -73543, -80734, -88391, -94218, -101260, -105257, -110817, -113056, -117433, -117813, -120214, -117785, -119129, -114626, -114119, -106911, -104319, -95449, -91607, -80220, -74547, -61394, -54771, -40064, -32495, -16312, -8007, 8602, 17451, 34203, 42778, 59880, 67986, 84234, 91451, 106345, 112614, 126306, 130912, 142059, 144956, 154115, 155099, 161777, 160108, 163557, 160382, 161035, 155449, 152982, 144918, 139857, 130462, 122263, 110816, 100294, 87561, 74950, 61506, 46567, 32770, 16936, 2567, -14097, -27492, -44907, -57310, -74634, -85783, -102012, -111054, -126883, -133904, -147441, -152079, -163865, -165403, -175609, -173811, -181172, -176942, -181408, -174022, -176460, -166130, -165534, -152677, -149861, -134582, -129996, -112360, -105186, -87024, -78322, -58571, -49154, -28532, -18244, 1610, 12613, 31924, 42407, 60742, 71120, 87204, 96289, 110923, 118489, 130892, 137022, 145360, 150382, 156545, 159005, 161937, 162010, 161895, 160703, 157425, 153696, 147224, 142360, 133264, 126780, 115513, 107176, 94353, 85534, 70609, 61711, 45582, 36192, 19846, 10634, -5654, -14247, -30374, -38187, -53269, -59248, -73624, -78278, -90915, -93909, -103982, -105508, -114274, -113296, -119868, -116903, -121363, -117015, -119004, -112762, -112697, -105294, -103314, -94335, -91006, -80857, -76166, -65677, -59358, -49010, -41931, -31262, -24107, -13731, -6493, 3212, 10524, 18964, 25817, 33178, 39640, 45528, 50688, 55303, 59650, 62822, 65935, 66924, 69507, 69235, 70278, 68474, 68327, 65551, 64761, 60404, 58634, 53591, 51507, 45442, 42708, 36380, 33162, 26803, 23351, 16701, 13831, 7105, 4094, -1900, -4464, -9946, -12233, -17281, -18718, -22625, -23732, -27425, -27580, -30085, -29846, -31545, -31115, -31900, -30338, -30830, -29115, -28629, -26598, -25674, -23290, -21985, -19564, -17796, -15532, -13599, -10866, -9242, -7154, -5069, -2977, -1062, 602, 1967, 3631, 5369, 6308, 7230, 8101, 9180, 9577, 10208, 10042, 10577, 10616, 10547, 9948, 10069, 9434, 9249, 8312, 7977, 7182, 6899, 5709, 5206, 4425, 3974, 2880, 2378, 1489, 1278, 465, -73, -751, -802, -1363, -1597, -2118, -2113, -2315, -2264, -2644, -2532, -2500, -2390, -2467, -2266, -2265, -1938, -1845, -1668, -1523, -1223, -1110, -891, -713, -516, -404, -222, -135, 17, 120, 151, 184, 296, 311, 336, 329, 333, 353, 356, 328, 291, 280, 259, 209, 175, 143, 111, 93, 59, 36, 19, 8, -2, -2, -11, -2, -4, -4, -2, -2, -4, -2, -3, -4, -1, 3, 1, 3, 2, -1, 1, 2, -1, 0, -1, -1, 2, 1},
      new int[] {7, 11, 15, 19, 20, 23, 24, 25, 27, 29, 32, 34, 36, 40, 42, 44, 52});
  }
}
